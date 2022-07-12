package com.training.vmo.mapper;

import java.util.List;

public interface EntityMapper<D, E>{
    E toEntity(D dto);

    D toDto(E entity);

    List<D> toDTOList(List<E> entityList);

    List<E> toEntityList(List<D> dtoList);
}

