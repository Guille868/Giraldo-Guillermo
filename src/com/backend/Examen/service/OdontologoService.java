package com.backend.Examen.service;



import com.backend.Examen.dao.IDao;

import com.backend.Examen.model.Odontologo;

import java.util.List;



public class OdontologoService {

    private IDao<Odontologo> OdontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {

        OdontologoIDao = odontologoIDao;

    }

    public List<Odontologo> listarOdontologos() {

        return OdontologoIDao.listarlos();

    }

}