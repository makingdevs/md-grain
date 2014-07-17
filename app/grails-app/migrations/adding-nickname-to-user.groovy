databaseChangeLog = {

	changeSet(author: "makingdevs (generated)", id: "1405609966211-1") {
		addColumn(tableName: "user") {
			column(name: "nickname", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
    sql("update user set nickname=substring(username,1,locate('@',username)-1)")
	}

}
