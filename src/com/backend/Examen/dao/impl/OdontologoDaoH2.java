package com.backend.Examen.dao.impl;

import com.backend.Examen.dao.H2Connection;
import com.backend.Examen.dao.IDao;
import com.backend.Examen.model.Odontologo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Logger;

public class OdontologoDaoH2 implements IDao <Odontologo>{

    private final Logger LOGGER = Logger.getLogger(OdontologoDaoH2.class);

    @Override
    public Odontologo registrar(Odontologo odontologo) {
        Connection connection = null;

        try{
            connection = H2Connection.getConnection();
            connection.setAutoCommit(false);

            PreparedStatement preparedStatement



            connection.commit();


        }catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            if (connection != null) {
                try {
                    connection.rollback();
                    LOGGER.info("Tuvimos un problema");
                    LOGGER.error(e.getMessage());
                    e.printStackTrace();
                } catch (SQLException exception) {
                    LOGGER.error(exception.getMessage());
                    exception.printStackTrace();
                }
            }
        } finally {
            try {
                connection.close();
            } catch (Exception exception) {
                LOGGER.error("No se pudo cerrar la conexión: " + exception.getMessage());
                exception.printStackTrace();
            }
        }





        return null;
    }

    @Override
    public Odontologo buscarPorId(int id) {
        return null;
    }
}
