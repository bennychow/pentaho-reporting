/*!
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
* Foundation.
*
* You should have received a copy of the GNU Lesser General Public License along with this
* program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
* or from the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU Lesser General Public License for more details.
*
* Copyright (c) 2002-2017 Hitachi Vantara..  All rights reserved.
*/

package org.pentaho.reporting.engine.classic.extensions.toc;

import org.pentaho.reporting.engine.classic.core.CompoundDataFactory;
import org.pentaho.reporting.engine.classic.core.SubReport;
import org.pentaho.reporting.engine.classic.core.TableDataFactory;
import org.pentaho.reporting.engine.classic.core.util.TypedTableModel;

public class IndexElement extends SubReport {
  /**
   * Creates a new subreport instance.
   */
  public IndexElement() {
    setElementType( new IndexElementType() );

    final Class[] columnTypes = new Class[ 4 ];
    final String[] columnNames = new String[ 4 ];
    columnNames[ 0 ] = "item-data";
    columnNames[ 1 ] = "item-pages";
    columnNames[ 2 ] = "item-pages-array";
    columnNames[ 3 ] = "item-key";
    columnTypes[ 0 ] = Object.class;
    columnTypes[ 1 ] = String.class;
    columnTypes[ 2 ] = Integer[].class;
    columnTypes[ 3 ] = String.class;
    final TypedTableModel sampleModel = new TypedTableModel( columnNames, columnTypes );

    final CompoundDataFactory compoundDataFactory = new CompoundDataFactory();
    compoundDataFactory.add( new TableDataFactory( "design-time-data", sampleModel ) );
    setQuery( "design-time-data" );
    setDataFactory( compoundDataFactory );
  }


}
