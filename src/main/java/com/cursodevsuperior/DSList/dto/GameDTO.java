package com.cursodevsuperior.DSList.dto;

import com.cursodevsuperior.DSList.entities.Game;
import org.springframework.beans.BeanUtils;

public class GameDTO {

    private Long id;
    private String title;
    private String year;
    private String imgUrl;
    private String genre;
    private String platforms;
    private String score;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {}

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this); // Copiando tudo que está na entidade para o esse (THIS) objeto
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatformms() {
        return platforms;
    }

    public void setPlatformms(String platforms) {
        this.platforms = platforms;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
