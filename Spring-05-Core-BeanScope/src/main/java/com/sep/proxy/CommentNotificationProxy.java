package com.sep.proxy;

import com.sep.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
