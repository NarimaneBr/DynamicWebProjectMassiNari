--
-- Create database
--

DROP DATABASE IF EXISTS BDD;
CREATE DATABASE BDD;
USE BDD;
--
-- Structure de la table `user`
--
DROP TABLE IF EXISTS `user`;
CREATE TABLE user (
  `id` int NOT NULL,
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `firstname` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

DROP TABLE IF EXISTS `post`;
CREATE TABLE post (
  `id` int NOT NULL,
  `title` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `text` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `id_user` int,
  foreign key (id_user) references user (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user`
--
select * from user;

select * from post;

INSERT INTO post(id, title, text, id_user) VALUES 
(1,'titre','hhahahahahaa',1);

LOCK TABLES `user` WRITE;

INSERT INTO user(id, username, name, firstname, password) VALUES 
(1,'Nari','BERRADJ','Narimane','nari'),

(2,'Massi','GALOUL','Massinissa','massi'),

(3,'Soussou','SAIGHI','Tafsouth','soussou'),

(4,'Moh','SERIK','Moh','moh'),

(5,'Para','MOUHOUBI','Samir','para');

UNLOCK TABLES;

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

-- Index pour la table `post`
--
ALTER TABLE `post`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour la table `post`
--
ALTER TABLE `post`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

