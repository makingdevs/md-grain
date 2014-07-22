databaseChangeLog = {

  changeSet(author: "makingdevs (generated)", id: "1406040129938-1") {
    addColumn(tableName: "perfil") {
      column(name: "public_profile", type: "bit") {
        constraints(nullable: "false")
      }
    }
  }

}
