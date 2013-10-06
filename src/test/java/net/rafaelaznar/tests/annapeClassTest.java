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
package net.rafaelaznar.tests;

import net.rafaelaznar.operaciones.annapeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ANP
 */
public class annapeClassTest {

    public annapeClassTest() {
        System.out.println("NewEmptyJUnitTest");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("beforeClass-setUpClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("afterClass-tearDownClass");
    }

    @Before
    public void setUp() {
        System.out.println("before-setUp");
    }

    @After
    public void tearDown() {
        System.out.println("after-tearDown");
    }

    @Test
    public void testGetNombreApellidos() {
        System.out.println("test: GetNombreApellidos()");
        annapeClass oAnnape = new annapeClass();
        assertNotNull("objeto annape creado", oAnnape);
        assertEquals("getNombre: Debe devolver Antonio", oAnnape.getNombre(), "Antonio");
        assertTrue("getApellido: Deve devolver Navarro", "Navarro".equals(oAnnape.getApellido1()));
        if (!oAnnape.getNombre().equals("Antonio")) {
            fail("getNombre: Nombre distinto de Antonio");
        }
        assertSame("prueba getReference", oAnnape, oAnnape.getReference());
        annapeClass oAnnape2 = new annapeClass();
        assertNotSame("no son el mismo objeto", oAnnape, oAnnape2);
    }

    private void assertNotNull(String objeto_annape_creado, annapeClass oAnnape) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void assertEquals(String nombre_Debe_devolver_Antonio, String nombre, String antonio) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void assertTrue(String apellido_Deve_devolver_Navarro, boolean equals) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void fail(String nombre_Nombre_distinto_de_Antonio) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void assertSame(String prueba_getReference, annapeClass oAnnape, annapeClass reference) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void assertNotSame(String no_son_el_mismo_objeto, annapeClass oAnnape, annapeClass oAnnape2) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
