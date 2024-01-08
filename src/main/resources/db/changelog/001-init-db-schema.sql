CREATE TABLE IF NOT EXISTS users
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(16) NOT NULL
);

CREATE TABLE IF NOT EXISTS recipe
(
    id          BIGSERIAL PRIMARY KEY,
    title       VARCHAR(45) NOT NULL,
    instruction TEXT        NOT NULL,
    author_id   BIGINT,

    FOREIGN KEY (author_id) REFERENCES users (id)
);

CREATE TABLE IF NOT EXISTS ingredient
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(45) NOT NULL
);

CREATE TABLE IF NOT EXISTS ingredient_recipe
(
    ingredient_id BIGSERIAL NOT NULL,
    recipe_id     BIGSERIAL NOT NULL,

    FOREIGN KEY (ingredient_id) REFERENCES ingredient (id),
    FOREIGN KEY (recipe_id) REFERENCES recipe (id)
);