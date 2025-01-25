package com.cursodevsuperior.DSList.projection;

// Metodos GET correspondente a consulta (@Query) do GameRepository
public interface GameMinProjection {

    Long getId();
    String getTitle();
    String getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
