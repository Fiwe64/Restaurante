CREATE TABLE mesas (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  pessoas INT NOT NULL,
  reserva_id BIGINT DEFAULT NULL,
  CONSTRAINT FK_mesa_reserva FOREIGN KEY (reserva_id) REFERENCES reservas(id)
);