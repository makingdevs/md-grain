databaseChangeLog = {

  changeSet(author: "makingdevs (generated)", id: "1379551577386-1") {
    createTable(tableName: "registration") {
      column(name: "id", type: "bigint") {
        constraints(nullable: "false", primaryKey: "true", primaryKeyName: "registrationPK")
      }

      column(name: "date_created", type: "datetime")

      column(name: "invoice", type: "bit")

      column(name: "last_updated", type: "datetime")

      column(name: "registration_status", type: "varchar(255)") {
        constraints(nullable: "false")
      }

      column(name: "scheduled_course_id", type: "bigint") {
        constraints(nullable: "false")
      }

      column(name: "user_id", type: "bigint") {
        constraints(nullable: "false")
      }
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-2") {
    dropForeignKeyConstraint(baseTableName: "payable", constraintName: "FKD116B202B65882FD")
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-3") {
    dropForeignKeyConstraint(baseTableName: "payable", constraintName: "FKD116B2029F6FF5B2")
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-6") {
    createIndex(indexName: "FKAF83E8B99F6FF5B2", tableName: "registration") {
      column(name: "user_id")
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-7") {
    createIndex(indexName: "FKAF83E8B9B65882FD", tableName: "registration") {
      column(name: "scheduled_course_id")
    }
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-8") {
    dropColumn(columnName: "class", tableName: "payable")
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-9") {
    dropColumn(columnName: "date_created", tableName: "payable")
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-10") {
    dropColumn(columnName: "invoice", tableName: "payable")
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-11") {
    dropColumn(columnName: "last_updated", tableName: "payable")
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-12") {
    dropColumn(columnName: "registration_status", tableName: "payable")
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-13") {
    dropColumn(columnName: "scheduled_course_id", tableName: "payable")
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-14") {
    dropColumn(columnName: "user_id", tableName: "payable")
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-4") {
    addForeignKeyConstraint(baseColumnNames: "scheduled_course_id", baseTableName: "registration", constraintName: "FKAF83E8B9B65882FD", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "scheduled_course", referencesUniqueColumn: "false")
  }

  changeSet(author: "makingdevs (generated)", id: "1379551577386-5") {
    addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "registration", constraintName: "FKAF83E8B99F6FF5B2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
  }
}
