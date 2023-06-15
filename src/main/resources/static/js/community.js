function post() {
    let questionId = $("#question_id").val();
    let content = $("#comment_content").val();
    comment2target(questionId,1,content);
}
function comment(e) {
    let commentId = e.getAttribute("data-id");
    let content = $("#input-" + commentId).val();
    comment2target(commentId,2,content);
}
function comment2target(targetId, type, content) {
    if (!content) {
        alert("不能回复空内容");
        return;
    }
    $.ajax({
        type: "POST",
        url: "/comment",
        contentType:"application/json",
        data: JSON.stringify({
            "parentId" : targetId,
            "content" : content,
            "type" : type
        }),
        success: function (response) {
            if (response.code == 200) {
                window.location.reload();
            }else {
                if (response.code == 2003) {
                    let isAccepted = confirm(response.message);
                    if (isAccepted) {
                        window.open("https://github.com/login/oauth/authorize?client_id=76b796f889cb9ca4cc9d&redirect_uri=http://localhost:8080/callback&scope=user&state=1")
                        window.localStorage.setItem("closable",true);
                    }
                }else {
                    alert(response.message);
                }

            }
        },
        dataType: "json"
    });
}

/**
  *展开二级评论
 */

function collapseComments(e) {
    let id = e.getAttribute("data-id");
    let comments = $("#comment-" + id);
    // 获取展开状态
    let attribute = e.getAttribute("data-collapse");
    if (attribute) {
        comments.removeClass("show");
        e.removeAttribute("data-collapse");
        e.classList.remove("active");
    }else {
        let subCommentContainer = $("#comment-" + id);
        if (subCommentContainer.children().length  != 1) {
            //展开二级评论
            comments.addClass("show");
            //当展开时进行标记
            e.setAttribute("data-collapse", "show");
            e.classList.add("active");
        } else {
            $.getJSON("/comment/" + id, function (data) {
                console.log(data);
                if (data.data != null) {
                    $.each(data.data.reverse(), function (index, comment) {
                        // console.log(comment.content)
                        let h5_element = $("<h5/>", {
                            "class": "mt-0"
                        }).append($("<span/>", {
                            html: comment.user.name
                        }));
                        let content_element = $("<div/>", {
                            html: comment.content
                        });
                        let span_element = $("<span/>", {
                            "class": "menu",
                        }).append($("<span/>", {
                            "class": "float-left",
                            html: moment(comment.gmtCreate).format('YYYY-MM-DD')
                        }));
                        let media_body_element = $("<div/>", {
                            "class": "media_body",
                        }).append(h5_element).append(content_element).append(span_element);
                        let img_element = $("<img/>", {
                            "class": "mr-2 rounded",
                            "src": comment.user.avatarUrl
                        });
                        let media_element = $("<div/>", {
                            "class": "media"
                        }).append(img_element).append(media_body_element);
                        let commentElement = $("<div/>", {
                            "class": "comment",
                        });
                        commentElement.append(media_element);
                        subCommentContainer.prepend(commentElement);

                    });
                }
                //展开二级评论
                comments.addClass("show");
                //当展开时进行标记
                e.setAttribute("data-collapse", "show");
                e.classList.add("active");
            });
        }
    }
}

function selectTag(e) {
    let previous = $("#tag").val();
    let value = e.getAttribute("data-tag");
    if (previous.indexOf(value)==-1) {
        if (previous) {
            $("#tag").val(previous + ',' + value);
        }else {
            $("#tag").val(value);
        }

    }
}

function showSelectTag() {

    $("#select-tag").show();
}