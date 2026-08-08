package com.example.HiRecruiter.repository;

import com.example.HiRecruiter.entities.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired
    private Firestore firestore;

    private static final String COLLECTION_NAME = "users";

    public void save(User user) throws Exception {

        ApiFuture<WriteResult> future = firestore
                .collection(COLLECTION_NAME)
                .document(user.getUid())
                .set(user);

        future.get();
    }
}