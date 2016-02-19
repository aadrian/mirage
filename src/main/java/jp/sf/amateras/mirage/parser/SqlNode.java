/*
 * Copyright 2004-2010 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.sf.amateras.mirage.parser;


/**
 * {@link Node} holding the SQL string itself.
 *
 * @author higa
 */
public class SqlNode extends AbstractNode {

    private String sql;

    public SqlNode(String sql) {
        this.sql = sql;
    }

    /**
     * @return the sql string
     */
    public String getSql() {
        return sql;
    }

    public void accept(SqlContext ctx) {
        ctx.addSql(sql);
    }

	@Override
	public String toString() {
		return "SqlNode [sql=" + sql + ", children=" + children + "]";
	}
}