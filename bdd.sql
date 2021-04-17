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

--
-- Dumping data for table `user`
--

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
