databaseChangeLog = {

  changeSet(author: "makingdevs (generated)", id: "1379516853524-1") {
    addColumn(tableName: "payable") {
      column(name: "class", type: "varchar(255)") {
        constraints(nullable: "false")
      }
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-2") {
    addColumn(tableName: "payable") {
      column(name: "date_created", type: "datetime")
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-3") {
    addColumn(tableName: "payable") {
      column(name: "invoice", type: "bit")
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-4") {
    addColumn(tableName: "payable") {
      column(name: "last_updated", type: "datetime")
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-5") {
    addColumn(tableName: "payable") {
      column(name: "registration_status", type: "varchar(255)")
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-6") {
    addColumn(tableName: "payable") {
      column(name: "scheduled_course_id", type: "bigint")
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-7") {
    addColumn(tableName: "payable") {
      column(name: "user_id", type: "bigint")
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-8") {
    dropForeignKeyConstraint(baseTableName: "registration", constraintName: "FKAF83E8B9B65882FD")
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-9") {
    dropForeignKeyConstraint(baseTableName: "registration", constraintName: "FKAF83E8B99F6FF5B2")
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-12") {
    createIndex(indexName: "FKD116B2029F6FF5B2", tableName: "payable") {
      column(name: "user_id")
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-13") {
    createIndex(indexName: "FKD116B202B65882FD", tableName: "payable") {
      column(name: "scheduled_course_id")
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-14") {
    dropTable(tableName: "registration")
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-10") {
    addForeignKeyConstraint(baseColumnNames: "scheduled_course_id", baseTableName: "payable", constraintName: "FKD116B202B65882FD", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "scheduled_course", referencesUniqueColumn: "false")
  }

  changeSet(author: "makingdevs (generated)", id: "1379516853524-11") {
    addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "payable", constraintName: "FKD116B2029F6FF5B2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
  }
}
