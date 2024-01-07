package com.learn.spring.entities;

import com.learn.spring.dto.AuthorDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    private Long id;

    private String name;

    private Integer age;

    public AuthorDto toDto(){
        return AuthorDto.builder()
                .id(this.id)
                .name(this.name)
                .age(this.age).build();
    }
}
