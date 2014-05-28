package ${packageName};


import org.springframework.stereotype.Repository;

import ${daoPath}.${modelName?substring(1)?cap_first}DaoI;
import ${entityPath}.${modelName};

@Repository("${modelName?substring(1)}Dao")
public class ${modelName?substring(1)?cap_first}DaoImpl extends BaseDaoImpl<${modelName}> implements ${modelName?substring(1)?cap_first}DaoI {

}
