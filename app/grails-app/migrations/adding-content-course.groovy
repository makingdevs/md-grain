databaseChangeLog = {

	changeSet(author: "neodevelop (generated)", id: "1377193750656-1") {
		addColumn(tableName: "course") {
			column(name: "content", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}
}
