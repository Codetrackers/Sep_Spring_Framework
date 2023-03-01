package com.sep.repostory;

import com.sep.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
