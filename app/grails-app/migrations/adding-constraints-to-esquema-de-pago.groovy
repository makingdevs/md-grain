databaseChangeLog = {

  changeSet(author: "neodevelop (generated)", id: "1379554536322-0") {
    sql('ALTER TABLE concepto ENGINE=InnoDB;')
    sql('ALTER TABLE course_session ENGINE=InnoDB;')
    sql('ALTER TABLE descuento ENGINE=InnoDB;')
    sql('ALTER TABLE esquema_de_pago ENGINE=InnoDB;')
    sql('ALTER TABLE esquema_de_pago_descuento ENGINE=InnoDB;')
    sql('ALTER TABLE organizacion ENGINE=InnoDB;')
    sql('ALTER TABLE organizacion_direccion ENGINE=InnoDB;')
    sql('ALTER TABLE organizacion_telefono ENGINE=InnoDB;')
    sql('ALTER TABLE pago ENGINE=InnoDB;')
    sql('ALTER TABLE pago_descuento ENGINE=InnoDB;')
    sql('ALTER TABLE payable ENGINE=InnoDB;')
    sql('ALTER TABLE payable_pago ENGINE=InnoDB;')
    sql('ALTER TABLE recargo ENGINE=InnoDB;')
    sql('ALTER TABLE registration ENGINE=InnoDB;')
    sql('ALTER TABLE s3asset ENGINE=InnoDB;')
    sql('ALTER TABLE s3asset_options ENGINE=InnoDB;')
  }  

  changeSet(author: "makingdevs (generated)", id: "1379554536322-1") {
    addColumn(tableName: "scheduled_course") {
      column(name: "esquema_de_pago_id", type: "bigint") {
        constraints(nullable: "false")
      }
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379554536322-3") {
    createIndex(indexName: "FK70BA6FED186427E3", tableName: "scheduled_course") {
      column(name: "esquema_de_pago_id")
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379554536322-4") {
    dropColumn(columnName: "cost_by_course", tableName: "scheduled_course")
  }

  changeSet(author: "makingdevs (generated)", id: "1379554536322-2") {
    addForeignKeyConstraint(baseColumnNames: "esquema_de_pago_id", baseTableName: "scheduled_course", constraintName: "FK70BA6FED186427E3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "esquema_de_pago", referencesUniqueColumn: "false")
  }
}
