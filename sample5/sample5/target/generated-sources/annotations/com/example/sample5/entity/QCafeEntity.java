package com.example.sample5.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCafeEntity is a Querydsl query type for CafeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCafeEntity extends EntityPathBase<CafeEntity> {

    private static final long serialVersionUID = 1861299927L;

    public static final QCafeEntity cafeEntity = new QCafeEntity("cafeEntity");

    public final StringPath amount = createString("amount");

    public final StringPath id = createString("id");

    public final StringPath menu = createString("menu");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> num = createNumber("num", Integer.class);

    public final StringPath req = createString("req");

    public final StringPath temp = createString("temp");

    public QCafeEntity(String variable) {
        super(CafeEntity.class, forVariable(variable));
    }

    public QCafeEntity(Path<? extends CafeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCafeEntity(PathMetadata metadata) {
        super(CafeEntity.class, metadata);
    }

}

