package org.hibernate.dialect;

import java.sql.Types;

import org.hibernate.dialect.Oracle10gDialect;
import org.hibernate.type.StandardBasicTypes;
  
/** 
 * @author lysming 
 * 
 */  
public class Oracle11gDialect extends Oracle10gDialect {  
    public Oracle11gDialect() {  
        super();  
        registerColumnType( Types.NVARCHAR, "nvarchar2($l)" );
        registerHibernateType(Types.NVARCHAR, StandardBasicTypes.STRING.getName() );
    }  
}  
