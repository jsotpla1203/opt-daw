package com.actividad3.actividad3.services;

import com.actividad3.actividad3.exceptions.DivisionCeroException;
import com.actividad3.actividad3.exceptions.FueraRangoException;
import com.actividad3.actividad3.exceptions.NumeroNegativoException;
import com.actividad3.actividad3.exceptions.OperacionIncorrectaException;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {


    public Double calcular(String operacion, Double numero1, Double numero2){
        if (numero1 > 100 || numero2 > 100){
            throw new FueraRangoException("Numeros fuera de rango");
        }
        if (operacion.equals("division") && numero2 == 0){
            throw new DivisionCeroException("No se puede dividir entre cero");
        }
        if (numero1 < 0 || numero2 < 0){
            throw new NumeroNegativoException("Los numeros no pueden ser negativos");
        }
        else {
            Double resultado = 0.0;
            if (operacion.equals("suma")){
                resultado = numero1 + numero2;
            }
            else if(operacion.equals("resta")){
                resultado = numero1 - numero2;
            }
            else if (operacion.equals("multiplicacion")){
                resultado = numero1 * numero2;
            }
            else if (operacion.equals("division")){
                resultado = numero1 / numero2;
            }
            else {
                throw new OperacionIncorrectaException("Operacion no aceptada");
            }


            return resultado;
        }
    }
}
