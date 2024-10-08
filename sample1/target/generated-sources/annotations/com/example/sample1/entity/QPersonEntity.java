package com.example.sample1.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPersonEntity is a Querydsl query type for PersonEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPersonEntity extends EntityPathBase<PersonEntity> {

    private static final long serialVersionUID = 1187540683L;

    public static final QPersonEntity personEntity = new QPersonEntity("personEntity");

    public final StringPath addr = createString("addr");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final NumberPath<Long> no = createNumber("no", Long.class);

    public final NumberPath<Integer> salary = createNumber("salary", Integer.class);

    public QPersonEntity(String variable) {
        super(PersonEntity.class, forVariable(variable));
    }

    public QPersonEntity(Path<? extends PersonEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPersonEntity(PathMetadata metadata) {
        super(PersonEntity.class, metadata);
    }

}

