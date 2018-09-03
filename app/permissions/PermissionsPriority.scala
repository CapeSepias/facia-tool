package permissions

sealed trait PermissionsPriority
case object EditorialPermission extends PermissionsPriority
case object CommercialPermission extends PermissionsPriority
case object EmailPermission extends PermissionsPriority
case object TrainingPermission extends PermissionsPriority


object PermissionsPriority {
  def stringToPermissionPriority(s: String): Option[PermissionsPriority] = {
    s.toLowerCase match {
      case "editorial" => Some(EditorialPermission)
      case "commercial" => Some(CommercialPermission)
      case "email" => Some(EmailPermission)
      case "training" => Some(TrainingPermission)
      case _ => None
    }
  }
}
