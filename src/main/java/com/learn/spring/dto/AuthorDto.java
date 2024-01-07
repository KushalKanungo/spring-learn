package com.learn.spring.dto;

import com.learn.spring.entities.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorDto {


    private Long id;

    private String name;

    private Integer age;

    public Author toEntity(){
        return Author.builder()
                .id(this.id)
                .age(age)
                .name(this.name)
                .build();
    }
}
