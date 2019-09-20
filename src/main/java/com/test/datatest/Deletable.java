package com.test.datatest;

import java.time.LocalDateTime;

public interface Deletable {
    int getDeleted();

    void setDeleteDate(LocalDateTime deleteDate);

    void setDeleteUserId(Long deleteUserId);
    Long getDeleteUserId();
}
