-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- GÃ©nÃ©rÃ© le : Mer 30 Novembre 2011 Ã  19:32
-- Version du serveur: 5.5.8
-- Version de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de donnÃ©es: 'cinema'
--

-- --------------------------------------------------------

--
-- Structure de la table 'acteur'
--

CREATE TABLE IF NOT EXISTS acteur (
  NoAct int(4) NOT NULL,
  NomAct varchar(20) NOT NULL,
  PrenAct varchar(20) DEFAULT NULL,
  DateNaiss date DEFAULT NULL,
  DateDeces date DEFAULT NULL,
  PRIMARY KEY (NoAct)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table 'acteur'
--

INSERT INTO acteur (NoAct, NomAct, PrenAct, DateNaiss, DateDeces) VALUES
(1, 'Reno', 'Jean', '1948-07-30', NULL),
(5, 'Portman', 'Natalie', '1981-06-09', NULL),
(7, 'Dujardin', 'Jean', '1972-06-19', NULL),
(8, 'Bourvil', '', '1917-07-27', '1970-09-23'),
(12, 'De Funes', 'Louis', '1914-07-31', '1983-01-27'),
(13, 'Anglade', 'Jean-Hugues', '1955-07-29', NULL),
(15, 'Lambert', 'Christophe', '1957-03-29', NULL);

-- --------------------------------------------------------

--
-- Structure de la table 'categorie'
--

CREATE TABLE IF NOT EXISTS categorie (
  CodeCat varchar(2) NOT NULL,
  LibelleCat varchar(20) NOT NULL,
  PRIMARY KEY (CodeCat)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table 'categorie'
--

INSERT INTO categorie (CodeCat, LibelleCat) VALUES
('AC', 'Action'),
('CO', 'ComÃ©die'),
('PO', 'Policier'),
('WE', 'Western');

-- --------------------------------------------------------

--
-- Structure de la table 'film'
--

CREATE TABLE IF NOT EXISTS film (
  NoFilm int(4) NOT NULL,
  Titre varchar(30) NOT NULL,
  Duree int(3) NOT NULL,
  DateSortie date NOT NULL,
  Budget int(8) NOT NULL,
  MontantRecette int(8) NOT NULL,
  NoRea int(2) NOT NULL,
  CodeCat varchar(2) NOT NULL,
  PRIMARY KEY (NoFilm),
  KEY NoRea (NoRea),
  KEY CodeCat (CodeCat)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table 'film'
--

INSERT INTO film (NoFilm, Titre, Duree, DateSortie, Budget, MontantRecette, NoRea, CodeCat) VALUES
(1, 'LÃ©on', 110, '1994-04-14', 17531000, 69250000, 3, 'PO'),
(2, 'Cash', 100, '2008-04-23', 18340000, 60340000, 4, 'PO'),
(3, 'La grande vadrouille', 132, '1966-12-01', 7227000, 51258000, 2, 'AC'),
(4, 'Subway', 104, '1985-04-10', 10567000, 70500000, 3, 'PO');

-- --------------------------------------------------------

--
-- Structure de la table 'personnage'
--

CREATE TABLE IF NOT EXISTS personnage (
  NoFilm int(4) NOT NULL,
  NoAct int(4) NOT NULL,
  NomPers varchar(30) NOT NULL,
  PRIMARY KEY (NoFilm,NoAct),
  KEY NoFilm (NoFilm),
  KEY NoAct (NoAct)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table 'personnage'
--

INSERT INTO personnage (NoFilm, NoAct, NomPers) VALUES
(1, 1, 'LÃ©on'),
(1, 5, 'Mathilda'),
(2, 1, 'Maxime Dubreuil'),
(2, 7, 'Cash'),
(3, 8, 'Augustin Bouvet'),
(3, 12, 'Stanislas Lefort'),
(4, 1, 'Le Batteur'),
(4, 13, 'Le Roller'),
(4, 15, 'Fred');

-- --------------------------------------------------------

--
-- Structure de la table 'realisateur'
--

CREATE TABLE IF NOT EXISTS realisateur (
  NoRea int(2) NOT NULL,
  NomRea varchar(20) NOT NULL,
  PrenRea varchar(20) NOT NULL,
  PRIMARY KEY (NoRea)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table 'realisateur'
--

INSERT INTO realisateur (NoRea, NomRea, PrenRea) VALUES
(1, 'Oury', 'GÃ©rard'),
(2, 'Chabrol', 'Claude'),
(3, 'Besson', 'Luc'),
(4, 'Besnard', 'Eric');

--
-- Contraintes pour les tables exportÃ©es
--

--
-- Contraintes pour la table `film`
--
ALTER TABLE `film`
  ADD CONSTRAINT film_ibfk_1 FOREIGN KEY (NoRea) REFERENCES realisateur (NoRea),
  ADD CONSTRAINT film_ibfk_2 FOREIGN KEY (CodeCat) REFERENCES categorie (CodeCat);

--
-- Contraintes pour la table `personnage`
--
ALTER TABLE `personnage`
  ADD CONSTRAINT personnage_ibfk_1 FOREIGN KEY (NoFilm) REFERENCES film (NoFilm),
  ADD CONSTRAINT personnage_ibfk_2 FOREIGN KEY (NoAct) REFERENCES acteur (NoAct);

