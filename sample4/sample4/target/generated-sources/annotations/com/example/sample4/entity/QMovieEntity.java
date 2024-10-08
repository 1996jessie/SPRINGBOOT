package com.example.sample4.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMovieEntity is a Querydsl query type for MovieEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovieEntity extends EntityPathBase<MovieEntity> {

    private static final long serialVersionUID = -288185155L;

    public static final QMovieEntity movieEntity = new QMovieEntity("movieEntity");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final StringPath genre = createString("genre");

    public final StringPath id = createString("id");

    public final StringPath memo = createString("memo");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> num = createNumber("num", Integer.class);

    public final NumberPath<Integer> partner = createNumber("partner", Integer.class);

    public final StringPath time = createString("time");

    public QMovieEntity(String variable) {
        super(MovieEntity.class, forVariable(variable));
    }

    public QMovieEntity(Path<? extends MovieEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovieEntity(PathMetadata metadata) {
        super(MovieEntity.class, metadata);
    }

}

