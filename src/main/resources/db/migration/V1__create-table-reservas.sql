CREATE TABLE reservas (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  dia_reserva DATE NOT NULL,
  horario TIME NOT NULL,
  cliente_id BIGINT NOT NULL,
  mesa_id BIGINT NOT NULL,
  CONSTRAINT FK_reserva_cliente FOREIGN KEY (cliente_id) REFERENCES clientes(id),
  CONSTRAINT FK_reserva_mesa FOREIGN KEY (mesa_id) REFERENCES mesas(id)
);