package com.cursodevsuperior.DSList.dto;

import com.cursodevsuperior.DSList.entities.Game;
import com.cursodevsuperior.DSList.projection.GameMinProjection;
import org.springframework.beans.BeanUtils;

public class GameMinDTO {

    private Long id;
    private String title;
    private String gameYear;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {}

    public GameMinDTO (Game gameEntity) {
        BeanUtils.copyProperties(gameEntity, this);
    }

    public GameMinDTO (GameMinProjection gameMinProjection) {
        BeanUtils.copyProperties(gameMinProjection, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGameYear() {
        return gameYear;
    }

    public void setGameYear(String gameYear) {
        this.gameYear = gameYear;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

}
