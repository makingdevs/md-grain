<g:if test="${flash.error || flash.info || flash.warning || flash.success}">
<section class="section-wrapper stripped">
  <div class="container">
    <div class="row">
      <div class="span12">
        <div class="white-card extra-padding">
          <div class="alert alert-success">
            <button class="close" dismiss="alert" name="button" type="button">x</button>
            <strong>Well done!</strong> You successfully read this important alert message.
          </div>
          <div class="alert alert-error">
            <button class="close" dismiss="alert" name="button" type="button">x</button>
            <strong>Oh snap!</strong> Change a few things up and try submitting again.
          </div>
          <div class="alert alert-warning">
            <button class="close" dismiss="alert" name="button" type="button">x</button>
            <strong>Well done!</strong> You successfully read this important alert message.
          </div>
          <div class="alert alert-info">
            <button class="close" dismiss="alert" name="button" type="button">x</button>
            <strong>Heads up!</strong> This alert needs your attention, but it's not super important.
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</g:if>