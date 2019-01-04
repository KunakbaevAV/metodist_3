package profstandart

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Prof(
        @SerializedName("XMLCardInfo")
        @Expose
        val xMLCardInfo: XMLCardInfo?
) {
    data class XMLCardInfo(
            val xmlnsxsi: String?,
            val xmlnsxsd: String?,
            @SerializedName("ProfessionalStandarts")
            @Expose
            val professionalStandarts: ProfessionalStandarts?
    ) {
        data class ProfessionalStandarts(
                @SerializedName("ProfessionalStandart")
                @Expose
                val professionalStandart: ProfessionalStandart?
        ) {
            data class ProfessionalStandart(
                    @SerializedName("")
                    @Expose
                    val dateOfApproval: String?,
                    @SerializedName("")
                    @Expose
                    val firstSection: FirstSection?,
                    @SerializedName("")
                    @Expose
                    val fourthSection: FourthSection?,
                    @SerializedName("NameProfessionalStandart")
                    @Expose
                    val nameProfessionalStandart: String?,
                    @SerializedName("")
                    @Expose
                    val orderNumber: String?,
                    @SerializedName("")
                    @Expose
                    val registrationNumber: String?,
                    @SerializedName("")
                    @Expose
                    val thirdSection: ThirdSection?
            ) {
                data class ThirdSection(
                        @SerializedName("")
                        @Expose
                        val workFunctions: WorkFunctions?
                ) {
                    data class WorkFunctions(
                            @SerializedName("")
                            @Expose
                            val generalizedWorkFunctions: GeneralizedWorkFunctions?
                    ) {
                        data class GeneralizedWorkFunctions(
                                @SerializedName("")
                                @Expose
                                val generalizedWorkFunction: List<GeneralizedWorkFunction?>?
                        ) {
                            data class GeneralizedWorkFunction(
                                    val codeOTF: String?,
                                    val educationalRequirements: EducationalRequirements?,
                                    val levelOfQualification: String?,
                                    val nameOTF: String?,
                                    val otherCharacteristicPlus: OtherCharacteristicPlus?,
                                    val otherCharacteristics: Any?,
                                    val particularWorkFunctions: ParticularWorkFunctions?,
                                    val possibleJobTitles: PossibleJobTitles?,
                                    val requirementsWorkExperiences: RequirementsWorkExperiences?,
                                    val specialConditionsForAdmissionToWork: SpecialConditionsForAdmissionToWork?
                            ) {
                                data class OtherCharacteristicPlus(
                                        val listEKS: ListEKS?,
                                        val listOKNPO: ListOKNPO?,
                                        val listOKSO: ListOKSO?,
                                        val listOKZ: ListOKZ?
                                ) {
                                    data class ListOKNPO(
                                            val unitOKNPO: UnitOKNPO?
                                    ) {
                                        data class UnitOKNPO(
                                                val codeOKNPO: String?,
                                                val nameOKNPO: String?
                                        )
                                    }

                                    data class ListEKS(
                                            @SerializedName("UnitEKS")
                                            @Expose
                                            val unitEKS: List<UnitEKS?>?
                                    ) {
                                        data class UnitEKS(
                                                val codeEKS: String?,
                                                val nameEKS: String?
                                        )
                                    }

                                    data class ListOKSO(
                                            val unitOKSO: UnitOKSO?
                                    ) {
                                        data class UnitOKSO(
                                                val codeOKSO: String?,
                                                val nameOKSO: String?
                                        )
                                    }

                                    data class ListOKZ(
                                            val unitOKZ: List<UnitOKZ?>?
                                    ) {
                                        data class UnitOKZ(
                                                val codeOKZ: String?,
                                                val nameOKZ: String?
                                        )
                                    }
                                }

                                data class RequirementsWorkExperiences(
                                        val requirementsWorkExperience: String?
                                )

                                data class ParticularWorkFunctions(
                                        val particularWorkFunction: List<ParticularWorkFunction?>?
                                ) {
                                    data class ParticularWorkFunction(
                                            val codeTF: String?,
                                            val laborActions: LaborActions?,
                                            val listFootnes: Any?,
                                            val nameTF: String?,
                                            val necessaryKnowledges: NecessaryKnowledges?,
                                            val otherCharacteristics: Any?,
                                            val requiredSkills: RequiredSkills?,
                                            val subQualification: String?
                                    ) {
                                        data class LaborActions(
                                                val laborAction: List<String?>?
                                        )

                                        data class NecessaryKnowledges(
                                                val necessaryKnowledge: String?
                                        )

                                        data class RequiredSkills(
                                                val requiredSkill: List<String?>?
                                        )
                                    }
                                }

                                data class PossibleJobTitles(
                                        val possibleJobTitle: List<String?>?
                                )

                                data class EducationalRequirements(
                                        val educationalRequirement: List<String?>?
                                )

                                data class SpecialConditionsForAdmissionToWork(
                                        val specialConditionForAdmissionToWork: List<String?>?
                                )
                            }
                        }
                    }
                }

                data class FirstSection(
                        val codeKindProfessionalActivity: String?,
                        val employmentGroup: EmploymentGroup?,
                        val kindProfessionalActivity: String?,
                        val purposeKindProfessionalActivity: String?
                ) {
                    data class EmploymentGroup(
                            val listOKVED: ListOKVED?,
                            val listOKZ: ListOKZ?
                    ) {
                        data class ListOKVED(
                                val unitOKVED: UnitOKVED?
                        ) {
                            data class UnitOKVED(
                                    val codeOKVED: String?,
                                    val nameOKVED: String?
                            )
                        }

                        data class ListOKZ(
                                val unitOKZ: List<UnitOKZ?>?
                        ) {
                            data class UnitOKZ(
                                    val codeOKZ: String?,
                                    val nameOKZ: String?
                            )
                        }
                    }
                }

                data class FourthSection(
                        val organizationDevelopers: OrganizationDevelopers?,
                        val responsibleDeveloper: ResponsibleDeveloper?
                ) {
                    data class OrganizationDevelopers(
                            val organizationDeveloper: List<String?>?
                    )

                    data class ResponsibleDeveloper(
                            val responsibleDeveloper: String?,
                            val theFullNameOfTheHead: String?,
                            val thePositionOfHead: String?
                    )
                }
            }
        }
    }
}

