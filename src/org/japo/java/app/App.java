/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class App {

    // Entrada al Mecanismo Funcional
    public void launchApp() {
        // Objeto GregorianCalendar
        GregorianCalendar gc = new GregorianCalendar();

        // Parámetros de fecha
        int dia = gc.get(Calendar.DAY_OF_MONTH);
        int mes = gc.get(Calendar.MONTH) + 1;
        int any = gc.get(Calendar.YEAR);
        
        // Variables auxiliares
        String nombre = "indefinido";
        int diaSemana = gc.get(Calendar.DAY_OF_WEEK);
        
        // Detección del día de la semana
        switch (diaSemana) {
            case Calendar.MONDAY:
                nombre = "lunes";
                break;
            case Calendar.TUESDAY:
                nombre = "martes";
                break;
            case Calendar.WEDNESDAY:
                nombre = "miércoles";
                break;
            case Calendar.THURSDAY:
                nombre = "jueves";
                break;
            case Calendar.FRIDAY:
                nombre = "viernes";
                break;
            case Calendar.SATURDAY:
                nombre = "sábado";
                break;
            case Calendar.SUNDAY:
                nombre = "domingo";
        }

        // Muestra la fecha del sistema
        System.out.printf("Fecha de hoy ...: %02d/%02d/%d [ %s ]%n", dia, mes, any, nombre);
    }
}
