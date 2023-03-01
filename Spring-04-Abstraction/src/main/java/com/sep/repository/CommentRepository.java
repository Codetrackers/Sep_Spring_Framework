package com.sep.repository;

import com.sep.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
