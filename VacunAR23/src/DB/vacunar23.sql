-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2023 a las 01:30:27
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
  `patologia` varchar(30) DEFAULT 'No Aplica',
  `ocupacion` varchar(30) DEFAULT 'No Aplica',
  `edad` int(11) NOT NULL,
  `responsableLegal` varchar(30) DEFAULT 'No Aplica',
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`dni`, `nombre`, `apellido`, `email`, `celular`, `patologia`, `ocupacion`, `edad`, `responsableLegal`, `estado`) VALUES
(17176162, 'Marcelo', 'García', 'marcegarcia@gmail.com', '16665979', '', '', 58, '', 1),
(22403720, 'Germán', 'Moreno', NULL, '156950453', NULL, NULL, 47, NULL, 1),
(24442632, 'Graciela', 'Valda', NULL, '157000453', 'Hepatitis B', 'Policía', 45, NULL, 1),
(27703700, 'LUIS', 'PIPO', 'pipoluis@correo.com', '1536258963', '', '', 45, '', 0),
(27703720, 'Germán', 'Adler', 'germanadler@gmail.com', '1569362578', 'Ninguna', 'Marinero', 43, 'No Aplica', 0),
(27703725, 'Eduardo Andrés', 'Cardozo', 'edulefranc@gmail.com', '152983615719', 'Ninguna', 'Profesional IT', 43, 'No Aplica', 1),
(29320841, 'Laura', 'O\'Hara', 'lauraohara@hotmail.com.ar', '15396521', 'Diabetes', 'Gastrónoma', 40, 'n/a', 1),
(30475221, 'Juliana', 'Hernandez', 'julianaher@gmail.com', '1569326510', '', 'Deportista', 38, NULL, 0),
(32496224, 'Gabriela Alejandra', 'D Angelo', 'gabrieladan@gmail.com', '2983447912', 'no aplica', 'ama de casa', 37, 'no aplica', 1),
(32821249, 'Lorena', 'Love', 'lorlov@gmail.com', '1523560206', 'Antitetánica', 'Profesional IT', 36, '', 1),
(35123456, 'Luis', 'Kala', 'No aplica', '1', 'No aplica', 'Obrero', 56, 'No aplica', 1),
(35890004, 'Aldana', 'Jarnek', 'aldjarn@gmail.com', '153693698', 'Ninguna', 'Gastrónoma', 35, 'N/A', 1),
(39266240, 'Sofía', 'Nuñez', 'snuñez@gmail.com', '1508236000', 'Gripe A', 'Sanidad', 39, NULL, 1),
(40255063, 'Darío', 'Sergi', 'dsergi@gamil.com', '155550630', 'Ninguna', 'Bombero', 25, NULL, 1),
(42055288, 'Andrea', 'Gorostiaga', 'agoros@gamil.com', '150230630', 'Cardiopatía congenita', 'Sanidad', 22, NULL, 0),
(42266409, 'Marianella', 'Delfos', 'marianadelfos@gmail.com', '150596690', 'Covid', NULL, 15, 'Mariana Delfos', 1),
(45678945, 'ehjdkhjk', 'jkljkld', 'rf@dfsf', '12312456', 'fdsfds', 'fdsf', 56, 'fsd', 1),
(50693123, 'Victor', 'Rodriguez', 'vr@gmail.com', '1523568923', '', NULL, 2, 'María Juarez', 1),
(50755089, 'Kaela', 'Karim', 'mariasolares@gmail.com', '1563891548', 'n/a', 'Ama de casa', 3, 'Maria Solares', 1),
(52033822, 'Jerónimo', 'Francis', 'solangegimenez@yahoo.com.ar', '1569224033', 'no aplica', 'no aplica', 5, 'Solange Gimenez', 1),
(52900600, 'Ancelmo', 'Gurrutia', 'gerardopaez@gmail.com', '15555600', 'Gripe común', NULL, 10, 'Gerardo Paez', 1),
(56400230, 'Carlos', 'Gurrutia', 'estebangurrutia@yahoo.com.ar', '1523568956', 'N/A', 'N/A', 2, 'Esteban Gurrutia', 1),
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
  `telefono` varchar(30) NOT NULL,
  `actividad` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`cuitLaboratorio`, `nombreLab`, `pais`, `domComercial`, `mail`, `telefono`, `actividad`) VALUES
(204567892, 'lab752', 'Inglaterra', 'lolo 456', 'glos@jiji.com', 'hjkghjk', 1),
(252341934, 'Umbrella', 'USA', 'Underground', 'umbrella.umbrella@revil.com', '2005559631', 1),
(258961232, 'Salinas Lab', 'España', 'Las Palomas 845', 'salinaslab@correo.com', '56982244500', 0),
(274561232, 'Tesla Drugs', 'USA', 'Park Av 795', 'tesladrugs@tesla.com', '+00058969321', 1),
(284441288, 'Dental Medrano', 'Argentina', 'Paraguay 436', 'dmedrano@medrano.com', '+5439521426', 1),
(285006038, 'Roemmers', 'Argentina', 'Carlos Calvo 1244', 'adminrommers@rommers.com', '+5465922804', 1),
(302569785, 'HonLab', 'China', 'Zuang +223', 'honlab.honlab@tiang.com.chn', '2032567451', 0),
(324469785, 'Pfizer', 'USA', 'Carpenter sth 156', 'Pfizer@lausa.com.ue', '295557003', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnovacunacion`
--

CREATE TABLE `turnovacunacion` (
  `codCita` int(11) NOT NULL,
  `dniCiudadano` int(11) NOT NULL,
  `codRefuerzo` varchar(30) NOT NULL DEFAULT 'NINGUNO',
  `centroVacunacion` varchar(30) NOT NULL,
  `fechaHoraColoca` date NOT NULL,
  `hora` time NOT NULL,
  `nroSerieDosis` int(11) NOT NULL,
  `turnoActivo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `turnovacunacion`
--

INSERT INTO `turnovacunacion` (`codCita`, `dniCiudadano`, `codRefuerzo`, `centroVacunacion`, `fechaHoraColoca`, `hora`, `nroSerieDosis`, `turnoActivo`) VALUES
(1428, 27703725, 'DOSIS 1', 'Centro Sur', '2023-10-31', '08:30:00', 20014, 1),
(9125, 24442632, 'DOSIS 3', 'Centro Norte', '2023-10-31', '00:00:00', 23040, 0),
(9126, 39266240, 'DOSIS 1', 'Centro Este', '2023-10-26', '00:00:00', 24926, 1),
(9127, 27703725, 'DOSIS 1', 'Centro Sur', '2023-11-03', '10:45:00', 20014, 0),
(9128, 32496224, 'DOSIS 3', 'Centro Sur', '2023-10-30', '00:00:00', 23040, 0),
(9129, 32496224, 'DOSIS 2', 'Centro Sur', '2023-11-20', '00:00:00', 24926, 0),
(9130, 32496224, 'DOSIS 1', 'Centro Sur', '2023-10-26', '00:00:00', 23748, 1),
(9131, 29320841, 'DOSIS 1', 'Centro Oeste', '2023-10-26', '00:00:00', 20014, 1),
(9132, 35890004, 'DOSIS 1', 'Centro Este', '2023-11-24', '00:00:00', 23748, 1),
(9133, 40255063, 'DOSIS 1', 'Centro Oeste', '2023-10-30', '00:00:00', 20014, 1),
(9134, 40255063, 'DOSIS 1', 'Centro Oeste', '2023-10-31', '00:00:00', 23040, 1),
(9135, 40255063, 'DOSIS 1', 'Centro Oeste', '2023-10-31', '00:00:00', 23040, 1),
(9136, 32821249, 'DOSIS 1', 'Centro Norte', '2023-10-30', '11:15:00', 20014, 1),
(9137, 58023688, 'DOSIS 1', 'Centro Norte', '2023-10-30', '08:30:00', 20014, 1),
(9138, 27703725, 'DOSIS 1', 'Centro Norte', '2023-10-31', '09:00:00', 23040, 1),
(9139, 32496224, 'DOSIS 1', 'Centro Norte', '2023-10-28', '09:15:00', 23040, 1),
(9140, 17176162, 'DOSIS 1', 'Centro Norte', '2024-01-04', '09:30:00', 24926, 1),
(9141, 32496224, 'DOSIS 2', 'Centro Sur', '2023-10-30', '08:45:00', 23748, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Apellido` varchar(30) NOT NULL,
  `mail` varchar(30) NOT NULL,
  `clave` varchar(10) NOT NULL,
  `perfil` enum('empleado','administrador','sin permisos','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `Nombre`, `Apellido`, `mail`, `clave`, `perfil`) VALUES
(1, 'Eduardo', 'Lefranc', 'eduardo@gmail.com', '1407', 'administrador');

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
  `stock` int(11) NOT NULL DEFAULT 1,
  `aplicacion` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`nroSerieDosis`, `cuitLaboratorio`, `nombreVacuna`, `marca`, `medida`, `vencimiento`, `stock`, `aplicacion`) VALUES
(20014, 252341934, 'V3', 'UV3X3', 0.185, '2026-10-14', 0, 0),
(23040, 302569785, 'Bexotolim', 'HonLab', 0.05, '2026-08-15', 0, 1),
(23748, 302569785, 'Garzol500', 'HonLab', 0.5, '2026-08-15', 0, 1),
(24926, 302569785, 'Vapulix', 'HonLab', 0.25, '2032-10-10', 0, 1),
(40020, 274561232, 'TjoDO', 'Testal Vaccine', 0.5, '2024-10-30', 1, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`dni`) USING BTREE,
  ADD UNIQUE KEY `dni` (`dni`);

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
  ADD KEY `dosis` (`nroSerieDosis`),
  ADD KEY `dniPaciente` (`dniCiudadano`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`nroSerieDosis`) USING BTREE,
  ADD KEY `cuitLab` (`cuitLaboratorio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `turnovacunacion`
--
ALTER TABLE `turnovacunacion`
  MODIFY `codCita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9142;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `turnovacunacion`
--
ALTER TABLE `turnovacunacion`
  ADD CONSTRAINT `dniPaciente` FOREIGN KEY (`dniCiudadano`) REFERENCES `ciudadano` (`dni`),
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
