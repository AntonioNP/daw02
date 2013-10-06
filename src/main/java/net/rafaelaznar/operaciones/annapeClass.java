/*
 * Copyright (C) 2013 ANP
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.rafaelaznar.operaciones;

/**
 *
 * @author ANP
 */
public class annapeClass {

    /**
     * Declaración de Variables.
     */
    private String nombre = "Antonio";
    private String apellido1 = "Navarro";
    private String apellido2 = "Peris";

    /**
     * Método que devuelve el nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre
     *
     * @return
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el primer apellido
     *
     * @return
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Método que devuelve el segundo apellido
     *
     * @return
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Método que establece el primer apellido
     *
     * @return
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Método que establece el segundo apellido
     *
     * @return
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * Método que devuelve el nombre y el apellido formateados
     *
     * @return nombre + apellido
     */
    public String getNombreApellidos() {
        return nombre + " " + apellido1 + " " + apellido2;
    }

    /**
     * Para obtener la referencia a este objeto
     *
     * @return referencia al objeto
     */
    public annapeClass getReference() {
        return this;
    }
}
