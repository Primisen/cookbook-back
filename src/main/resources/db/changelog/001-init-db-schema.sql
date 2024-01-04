CREATE TABLE IF NOT EXISTS recipe
(
    id          BIGSERIAL PRIMARY KEY,
    instruction TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS ingredient
(
    id        BIGSERIAL PRIMARY KEY,
    name      VARCHAR(45) NOT NULL,
    recipe_id INT         NOT NULL,

    FOREIGN KEY (recipe_id) REFERENCES recipe (id)
);