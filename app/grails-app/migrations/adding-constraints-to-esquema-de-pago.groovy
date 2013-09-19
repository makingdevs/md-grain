databaseChangeLog = {

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
