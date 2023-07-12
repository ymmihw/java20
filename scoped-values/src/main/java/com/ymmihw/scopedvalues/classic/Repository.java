package com.ymmihw.scopedvalues.classic;


import com.ymmihw.scopedvalues.data.Data;
import com.ymmihw.scopedvalues.data.User;

import java.util.Optional;

public class Repository {

    public Optional<Data> getData(String id, User user) {
        return user.isAdmin()
                ? Optional.of(new Data(id, "Title 1", "Description 1"))
                : Optional.empty();
    }

}
