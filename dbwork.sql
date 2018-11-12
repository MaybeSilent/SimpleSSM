CREATE TABLE users ( 
    id INTEGER NOT NULL AUTO_INCREMENT, 
    email VARCHAR(64), 
    username VARCHAR(32) NOT NULL, 
    password_hash VARCHAR(128), 
    avatar VARCHAR(64), 
    self_intro VARCHAR(40), 
    gender INTEGER, 
    PRIMARY KEY (id) 
);

CREATE TABLE statuses ( 
    id INTEGER NOT NULL AUTO_INCREMENT, 
    text TEXT NOT NULL, 
    timestamp DATETIME NOT NULL, 
    user_id INTEGER NOT NULL, 
    PRIMARY KEY (id), 
    FOREIGN KEY(user_id) REFERENCES users (id)
);

CREATE TABLE status_replies ( 
    id INTEGER NOT NULL AUTO_INCREMENT, 
    text TEXT NOT NULL, 
    timestamp DATETIME, 
    status_id INTEGER NOT NULL, 
    user_id INTEGER NOT NULL, 
    PRIMARY KEY (id), 
    FOREIGN KEY(status_id) REFERENCES statuses (id), 
    FOREIGN KEY(user_id) REFERENCES users (id) 
);


CREATE TABLE sales ( 
    id INTEGER NOT NULL AUTO_INCREMENT, 
    title VARCHAR(32) NOT NULL, 
    text TEXT NOT NULL, 
    price FLOAT, location VARCHAR(16), 
    category VARCHAR(16), 
    user_id INTEGER NOT NULL, 
    timestamp DATETIME NOT NULL, 
    PRIMARY KEY (id), 
    FOREIGN KEY(user_id) REFERENCES users (id) 
);

CREATE TABLE sale_comments ( 
    id INTEGER NOT NULL AUTO_INCREMENT, 
    text TEXT NOT NULL, 
    timestamp DATETIME, 
    sale_id INTEGER NOT NULL, 
    user_id INTEGER NOT NULL, 
    PRIMARY KEY (id), 
    FOREIGN KEY(sale_id) REFERENCES sales (id), 
    FOREIGN KEY(user_id) REFERENCES users (id) 
);

CREATE TABLE tokens (
    id INTEGER NOT NULL AUTO_INCREMENT,
    token VARCHAR(128),
    user_id INTEGER NOT NULL,
    PRIMARY KEY (id), 
    FOREIGN KEY(user_id) REFERENCES users (id) 
);