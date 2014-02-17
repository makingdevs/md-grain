<html>
<head>
  <meta name="layout" content="venera"/>
  <title>User profile</title>
</head>
<body>
  <section class="section-wrapper">
    <div class="container-fluid">
      <div class="white-card extra-padding">
        <div class="row-fluid">
        

          <div class="span12">
            <h3 class="section-header">Perfil de ${user.username}</h3>
          </div>

          <div class="row-fluid">
          
            <div class="span12">
              <table>
                <table class="table no-margin table-striped table-bordered">
                  <thead>
                    <tr>
                      <th>#</th>
                      <th>Course</th>
                      <th>Status</th>
                      <th>Invoice</th>
                      <th>Actions</th>
                    </tr>
                  </thead>
                  <tbody>
                    <g:each in="${user.registrations}" var="registration" status="i">
                    <tr>
                      <td>${i+1}</td>
                      <td>${registration.scheduledCourse.course}</td>
                      <td>${registration.registrationStatus}</td>
                      <td>${registration.invoice}</td>
                      <td>
                        <div class="btn-group">
                          <g:link controller="user" action="registration" id="${registration.id}" class="btn btn-mini">
                            <i class="icon icon-edit"></i> Edit</button>
                          </g:link>
                          <g:link id="${registration.id}" class="btn btn-mini">
                            <i class="icon icon-list"></i> Evaluate</button>
                          </g:link>
                          <g:link id="${registration.id}" class="btn btn-mini">
                            <i class="icon icon-remove"></i> Cancel</button>
                          </g:link>
                        </div>
                      </td>
                    </tr>
                    </g:each>
                  </tbody>
                </table>
              </table>
            </div>
          </div>
        </div>
      </div>
      <div class="white-card extra-padding">
        <div class="row-fluid">
          <div class="span12">
            <strong>Agrega un cuestionario:</strong>
            <g:showQuestionaryForThisInstance instance="${user}"/>
          </div>
        </div>
      </div>
    </div>
  </section>
</body>
</html>