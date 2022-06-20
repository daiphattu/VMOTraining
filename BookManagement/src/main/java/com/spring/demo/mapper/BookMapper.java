package com.spring.demo.mapper;

import com.spring.demo.dto.BookDTO;
import com.spring.demo.entities.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper extends EntityMapper<BookDTO, Book>{

}
