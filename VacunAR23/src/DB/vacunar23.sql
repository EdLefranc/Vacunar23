-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 23:33:34
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vacunar23`
--
CREATE DATABASE IF NOT EXISTS `vacunar23` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `vacunar23`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `dni` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `celular` varchar(30) NOT NULL,
  `patologia` varchar(30) DEFAULT NULL,
  `ocupacion` varchar(30) DEFAULT NULL,
  `edad` int(11) NOT NULL,
  `responsableLegal` varchar(30) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`dni`, `nombre`, `apellido`, `email`, `celular`, `patologia`, `ocupacion`, `edad`, `responsableLegal`, `estado`) VALUES
(22403720, 'Germán', 'Moreno', NULL, '156950453', NULL, NULL, 47, NULL, 1),
(24442632, 'Graciela', 'Valda', NULL, '157000453', 'Hepatitis B', 'Policía', 45, NULL, 1),
(27703725, 'Eduardo', 'Cardozo', 'edulefranc@gmail.com', '152983615719', 'Ninguna', 'Profesional IT', 43, 'N/A', 1),
(32821249, 'Lorena', 'Love', 'lorlov@gmail.com', '1523560206', 'Antitetánica', 'Profesional IT', 36, '', 1),
(35890004, 'Aldana', 'Jarnek', 'aldjarn@gmail.com', '153693698', 'Ninguna', 'N/A', 35, 'N/A', 1),
(39266240, 'Sofía', 'Nuñez', 'snuñez@gmail.com', '1508236000', 'Gripe A', 'Sanidad', 39, NULL, 1),
(40255063, 'Darío', 'Sergi', 'dsergi@gamil.com', '155550630', 'Ninguna', 'Bombero', 25, NULL, 1),
(42266409, 'Marianella', 'Delfos', 'marianadelfos@gmail.com', '150596690', 'Covid', NULL, 15, 'Mariana Delfos', 1),
(50693123, 'Victor', 'Rodriguez', 'vr@gmail.com', '1523568923', '', NULL, 2, 'María Juarez', 1),
(52900600, 'Ancelmo', 'Gurrutia', 'gerardopaez@gmail.com', '15555600', 'Gripe común', NULL, 10, 'Gerardo Paez', 1),
(58023688, 'Camila', 'DiPaolo', 'danielalula@gmail.com', '15200600', 'Triple', NULL, 5, 'Daniela Calula', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `cuitLaboratorio` int(16) NOT NULL,
  `nombreLab` varchar(30) NOT NULL,
  `pais` varchar(30) NOT NULL,
  `domComercial` varchar(30) NOT NULL,
  `mail` varchar(30) NOT NULL,
  `telefono` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`cuitLaboratorio`, `nombreLab`, `pais`, `domComercial`, `mail`, `telefono`) VALUES
(252341934, 'Umbrella', 'USA', 'Unknow', 'umbrella.umbrella@revil.com', 2005559631),
(285006038, 'GoldLabs', 'Canadá', 'Rob Carlson 793 Mo', 'goldlabs.admincenter@glabs.com', 1923622804),
(302569785, 'HonLab', 'China', 'Zuang +223', 'honlab.honlab@tiang.com.chn', 2032567451),
(324469785, 'Pfizer', 'USA', 'Carpenter sth 156', 'Pfizer@lausa.com.ue', 295557003);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnovacunacion`
--

CREATE TABLE `turnovacunacion` (
  `codCita` int(11) NOT NULL,
  `dniCiudadano` int(11) NOT NULL,
  `codRefuerzo` int(11) NOT NULL,
  `centroVacunacion` varchar(30) NOT NULL,
  `fechaHoraColoca` datetime NOT NULL,
  `nroSerieDosis` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `turnovacunacion`
--

INSERT INTO `turnovacunacion` (`codCita`, `dniCiudadano`, `codRefuerzo`, `centroVacunacion`, `fechaHoraColoca`, `nroSerieDosis`) VALUES
(9123, 22403720, 1, 'Umbrella Labs', '2023-10-23 21:00:00', 20014);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `nroSerieDosis` int(16) NOT NULL,
  `cuitLaboratorio` int(16) NOT NULL,
  `nombreVacuna` varchar(30) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `medida` double NOT NULL,
  `vencimiento` date NOT NULL,
  `aplicacion` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`nroSerieDosis`, `cuitLaboratorio`, `nombreVacuna`, `marca`, `medida`, `vencimiento`, `aplicacion`) VALUES
(20014, 252341934, 'V3', 'UV3X3', 0.155, '2026-10-14', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`dni`) USING BTREE;

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`cuitLaboratorio`) USING BTREE;

--
-- Indices de la tabla `turnovacunacion`
--
ALTER TABLE `turnovacunacion`
  ADD PRIMARY KEY (`codCita`),
  ADD KEY `dniCiudadano` (`dniCiudadano`),
  ADD KEY `dosis` (`nroSerieDosis`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`nroSerieDosis`) USING BTREE,
  ADD KEY `cuitLab` (`cuitLaboratorio`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `turnovacunacion`
--
ALTER TABLE `turnovacunacion`
  ADD CONSTRAINT `dniCiudadano` FOREIGN KEY (`dniCiudadano`) REFERENCES `ciudadano` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `dosis` FOREIGN KEY (`nroSerieDosis`) REFERENCES `vacuna` (`nroSerieDosis`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `cuitLab` FOREIGN KEY (`cuitLaboratorio`) REFERENCES `laboratorio` (`cuitLaboratorio`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
