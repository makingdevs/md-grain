databaseChangeLog = {

	changeSet(author: "neodevelop (generated)", id: "1377193750656-1") {
		addColumn(tableName: "course") {
			column(name: "content", type: "longtext") {
				constraints(nullable: "false")
			}
		}
	}

  changeSet(author: "neodevelop (generated)", id: "1377193750656-2") {
    sql("update course set content='content' where 1=1")
  }
}
