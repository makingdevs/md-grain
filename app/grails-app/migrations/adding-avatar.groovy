databaseChangeLog = {

	changeSet(author: "neodevelop (generated)", id: "1387829719858-1") {
		addColumn(tableName: "perfil") {
			column(name: "avatar_id", type: "bigint")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1387829719858-3") {
		createIndex(indexName: "FKC4E369CC73BBF74D", tableName: "perfil") {
			column(name: "avatar_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1387829719858-4") {
		dropColumn(columnName: "avatar", tableName: "perfil")
	}

	changeSet(author: "neodevelop (generated)", id: "1387829719858-2") {
		addForeignKeyConstraint(baseColumnNames: "avatar_id", baseTableName: "perfil", constraintName: "FKC4E369CC73BBF74D", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "s3asset", referencesUniqueColumn: "false")
	}
}
