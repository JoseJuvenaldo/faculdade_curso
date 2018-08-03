/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  JUVENALDO
    Author:  RONALDO
 * Created: 03/08/2018
 */

-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 03-Ago-2018 às 19:03
-- Versão do servidor: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fc`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso`
--

CREATE TABLE `curso` (
  `CURSO_ID` int(11) NOT NULL,
  `NOME` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `curso`
--

INSERT INTO `curso` (`CURSO_ID`, `NOME`) VALUES
(1, 'LICENCIATURA  PLENA EM CIÊNCIAS BIOLÓGICAS'),
(2, 'ADMINISTRACAO'),
(3, 'PEDAGOGIA'),
(4, 'ENFERMAGEM'),
(5, 'RECURSOS HUMANOS');

-- --------------------------------------------------------

--
-- Estrutura da tabela `endereco`
--

CREATE TABLE `endereco` (
  `ENDERECO_ID` int(11) NOT NULL,
  `CIDADE` varchar(60) NOT NULL,
  `BAIRRO` varchar(60) DEFAULT NULL,
  `RUA` varchar(100) DEFAULT NULL,
  `NUMERO` varchar(11) DEFAULT NULL,
  `TELEFONE` varchar(11) DEFAULT NULL,
  `COMPLEMENTO` varchar(100) DEFAULT NULL,
  `pessoa_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `endereco`
--

INSERT INTO `endereco` (`ENDERECO_ID`, `CIDADE`, `BAIRRO`, `RUA`, `NUMERO`, `TELEFONE`, `COMPLEMENTO`, `pessoa_id`) VALUES
(1, 'PARNAÍBA', 'SÃO JUDAS TADEU', 'AVENIDA PADRE RAIMUNDO JOSÉ VIEIRA', '789', '99444-4444', '', NULL),
(2, 'PARNAÍBA', 'JOÃO XXIII', 'RUA FREI GALVÃO', '1200', '99444-5555', NULL, NULL),
(3, 'PARANAIBA', 'JOÃO XXII', 'RUA FREI GALVÃO', '542', '99599-8888', 'AO LADO DA QUADRA', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `estado`
--

CREATE TABLE `estado` (
  `ESTADO_ID` int(11) NOT NULL,
  `UF` char(2) DEFAULT NULL,
  `NOME` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `estado`
--

INSERT INTO `estado` (`ESTADO_ID`, `UF`, `NOME`) VALUES
(1, 'AC', 'ACRE'),
(2, 'AL', 'ALAGOAS'),
(3, 'AP', 'AMAPA'),
(4, 'AM', 'AMAZONAS'),
(5, 'BA', 'BAHIA'),
(6, 'CE', 'CEARA'),
(7, 'DF', 'DISTRITO FEDERAL'),
(8, 'ES', 'ESPIRITO SANTO'),
(9, 'GO', 'GOIAS');

-- --------------------------------------------------------

--
-- Estrutura da tabela `faculdade`
--

CREATE TABLE `faculdade` (
  `FACULDADE_ID` int(11) NOT NULL,
  `NOME` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `faculdade`
--

INSERT INTO `faculdade` (`FACULDADE_ID`, `NOME`) VALUES
(1, 'Universidade de Brasília'),
(2, 'Universidade Federal da Grande Dourados'),
(3, 'Universidade Federal de Goiás'),
(4, 'Universidade Federal de Mato Grosso'),
(5, '	Universidade Federal de Mato Grosso do Sul'),
(6, 'Universidade Federal de Catalão');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `PESSOA_ID` int(11) NOT NULL,
  `NOME` varchar(60) NOT NULL,
  `RG` varchar(11) DEFAULT NULL,
  `CPF` varchar(11) NOT NULL,
  `SEXO` enum('M','F') DEFAULT NULL,
  `DATA_NASCIMENTO` date NOT NULL,
  `EMAIL` varchar(60) DEFAULT NULL,
  `CURSO_ID` int(11) DEFAULT NULL,
  `ESTADO_ID` int(11) DEFAULT NULL,
  `FACULDADE_ID` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`PESSOA_ID`, `NOME`, `RG`, `CPF`, `SEXO`, `DATA_NASCIMENTO`, `EMAIL`, `CURSO_ID`, `ESTADO_ID`, `FACULDADE_ID`) VALUES
(1, 'Ana Maria', '8.368.458', '12345678912', 'F', '1990-10-10', 'aluno1@email.com', 1, 1, 1),
(2, 'Pedro Henrique', '8.368.100', '32145678912', 'M', '1987-09-08', 'aluno2@email.com', 2, 1, 3),
(3, 'Mariana Martins', '7.566.888', '9874563214', 'F', '2000-12-01', 'aluno3@email.com', 3, 4, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`CURSO_ID`),
  ADD UNIQUE KEY `CURSO_ID` (`CURSO_ID`);

--
-- Indexes for table `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`ENDERECO_ID`),
  ADD UNIQUE KEY `ENDERECO_ID` (`ENDERECO_ID`),
  ADD UNIQUE KEY `TELEFONE` (`TELEFONE`),
  ADD KEY `pessoa_id` (`pessoa_id`);

--
-- Indexes for table `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`ESTADO_ID`),
  ADD UNIQUE KEY `ESTADO_ID` (`ESTADO_ID`);

--
-- Indexes for table `faculdade`
--
ALTER TABLE `faculdade`
  ADD PRIMARY KEY (`FACULDADE_ID`),
  ADD UNIQUE KEY `FACULDADE_ID` (`FACULDADE_ID`);

--
-- Indexes for table `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`PESSOA_ID`),
  ADD UNIQUE KEY `PESSOA_ID` (`PESSOA_ID`),
  ADD UNIQUE KEY `CPF` (`CPF`),
  ADD UNIQUE KEY `RG` (`RG`),
  ADD KEY `CURSO_ID` (`CURSO_ID`),
  ADD KEY `ESTADO_ID` (`ESTADO_ID`),
  ADD KEY `FACULDADE_ID` (`FACULDADE_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- USE FC;

-- SELECT * FROM ESTADO;
-- SELECT * FROM CURSO;
-- SELECT * FROM FACULDADE;
-- SELECT * FROM PESSOA;
-- SELECT * FROM ENDERECO;

/*
SELECT PESSOA.NOME, ESTADO.UF, ESTADO.NOME
FROM PESSOA, ESTADO
WHERE PESSOA.PESSOA_ID = ESTADO.ESTADO_ID;
*/


