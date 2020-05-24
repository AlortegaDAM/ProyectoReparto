-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 24-05-2020 a las 12:10:23
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `sistemareparto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `movil` double DEFAULT NULL,
  `mail` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombre`, `direccion`, `movil`, `mail`) VALUES
(1, 'Pamela', 'Calle La Perla', 654212304, 'Pamela@mail.es'),
(2, 'Juan', 'Barrio nuevo', 600234231, 'Juancliente@prueba1.es'),
(3, 'Jaime', 'Calle la palma', 600777731, 'Jaime@prueba.es');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `moto`
--

CREATE TABLE IF NOT EXISTS `moto` (
  `matricula` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `km` decimal(10,2) NOT NULL,
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `moto`
--

INSERT INTO `moto` (`matricula`, `marca`, `km`, `id`) VALUES
('XVC4567', 'Peugeot', '1000.00', 1),
('XVS5454', 'Yamaha', '0.00', 2),
('CVB5060', 'Vespa', '18000.00', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE IF NOT EXISTS `pedido` (
  `idPedido` int(11) NOT NULL AUTO_INCREMENT,
  `total` decimal(10,2) DEFAULT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  `Repartidor_idRepartidor` int(11) NOT NULL,
  PRIMARY KEY (`idPedido`),
  UNIQUE KEY `idPedido` (`idPedido`),
  KEY `fk_Pedido_Cliente_idx` (`Cliente_idCliente`),
  KEY `fk_Pedido_Repartidor1_idx` (`Repartidor_idRepartidor`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `total`, `Cliente_idCliente`, `Repartidor_idRepartidor`) VALUES
(1, '114.00', 1, 1),
(2, '53.00', 2, 4),
(3, '114.00', 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_has_producto`
--

CREATE TABLE IF NOT EXISTS `pedido_has_producto` (
  `Pedido_idPedido` int(11) NOT NULL,
  `Producto_idProducto` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `subtotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`Pedido_idPedido`,`Producto_idProducto`),
  KEY `fk_Pedido_has_Producto_Producto1_idx` (`Producto_idProducto`),
  KEY `fk_Pedido_has_Producto_Pedido1_idx` (`Pedido_idPedido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pedido_has_producto`
--

INSERT INTO `pedido_has_producto` (`Pedido_idPedido`, `Producto_idProducto`, `cantidad`, `subtotal`) VALUES
(1, 1, 3, '43.50'),
(1, 3, 4, '38.00'),
(1, 6, 5, '32.50'),
(2, 1, 1, '14.50'),
(2, 3, 2, '19.00'),
(2, 6, 3, '19.50'),
(3, 1, 3, '43.50'),
(3, 3, 4, '38.00'),
(3, 6, 5, '32.50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` int(10) unsigned NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `precio` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `codigo`, `nombre`, `descripcion`, `precio`) VALUES
(1, 1, 'Rabo de toro', 'Especialidad de la casa', '14.50'),
(3, 2, 'Flamenquin', 'Pollo/jamón', '9.50'),
(6, 10, 'Salmorejo', 'Mu rico', '6.50'),
(7, 5, 'Gazpacho', 'Fresquito', '6.50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repartidor`
--

CREATE TABLE IF NOT EXISTS `repartidor` (
  `idRepartidor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `turno` varchar(45) DEFAULT NULL,
  `idMoto` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`idRepartidor`),
  KEY `idMoto` (`idMoto`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `repartidor`
--

INSERT INTO `repartidor` (`idRepartidor`, `nombre`, `turno`, `idMoto`) VALUES
(1, 'Luis', 'Mañanas', NULL),
(2, 'Daniel', 'Tardes', NULL),
(3, 'Prueba', 'Ninguno', NULL),
(4, 'Arturo', 'Jefe', NULL);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `fk_Pedido_Cliente` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Pedido_Repartidor1` FOREIGN KEY (`Repartidor_idRepartidor`) REFERENCES `repartidor` (`idRepartidor`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `pedido_has_producto`
--
ALTER TABLE `pedido_has_producto`
  ADD CONSTRAINT `pedido_has_producto_ibfk_1` FOREIGN KEY (`Pedido_idPedido`) REFERENCES `pedido` (`idPedido`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pedido_has_producto_ibfk_2` FOREIGN KEY (`Producto_idProducto`) REFERENCES `producto` (`idProducto`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `repartidor`
--
ALTER TABLE `repartidor`
  ADD CONSTRAINT `repartidor_ibfk_1` FOREIGN KEY (`idMoto`) REFERENCES `moto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
