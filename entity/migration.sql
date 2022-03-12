create table "user"


(
    id                bigint generated by default as identity

        constraint user_pk primary key,

    username          varchar not null,

    password          varchar not null,

    created_by        bigint,

    created_date_time timestamp,

    updated_by        bigint,

    updated_date_time timestamp,

    version           integer

);



create unique index user_username_uindex on "user" (username);



create table post

(

    id                bigint generated by default as identity
        constraint post_pk
            primary key,

    created_by        bigint,

    created_date_time timestamp,

    updated_by        bigint,

    updated_date_time timestamp,

    version           integer,

    created_by_name   varchar(255),

    content           varchar(255)

);



create table post_comments

(

    id                bigint generated by default as identity

        constraint post_detail_pk
            primary key,

    created_by        bigint,

    created_date_time timestamp,

    updated_by        bigint,

    updated_date_time timestamp,

    version           integer,

    comment_text      varchar(255),

    commented_by      bigint not null

        constraint user_commented_by_fk
            references "user",

    comment_date_time timestamp


);



create table tag

(

    id                bigint generated by default as identity

        constraint tag_pk
            primary key,

    created_by        bigint,

    created_date_time timestamp,

    updated_by        bigint,

    updated_date_time timestamp,

    version           integer,

    tag_name          varchar(255)

);



create table post_tags

(

    post_id bigint not null

        constraint post_post_id_fk
            references post,

    tag_id  bigint not null

        constraint tag_tag_id_fk
            references tag,

    constraint post_tags_pk
        primary key (post_id, tag_id)

);