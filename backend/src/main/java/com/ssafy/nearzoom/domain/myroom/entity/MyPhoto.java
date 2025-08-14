package com.ssafy.nearzoom.domain.myroom.entity;

import com.ssafy.nearzoom.global.common.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MyPhoto extends BaseEntity {

    private Long photoId;
    private String imgUrl;
    private String userList;
    private Long roomId;
    private Long originalPhotoId;

    public MyPhoto(String imgUrl, String userList, Long roomId, Long originalPhotoId) {
        this.imgUrl = imgUrl;
        this.userList = userList;
        this.roomId = roomId;
        this.originalPhotoId = originalPhotoId;
    }
}